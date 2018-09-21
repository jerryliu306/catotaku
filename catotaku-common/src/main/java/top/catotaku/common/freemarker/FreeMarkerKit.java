package top.catotaku.common.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import top.catotaku.common.core.Prop;
import top.catotaku.common.core.PropKit;

import java.io.*;
import java.net.Socket;
import java.util.Map;

public class FreeMarkerKit {

    private FreeMarkerConfigurer freeMarkerConfigurer;

    private String host;
    private Integer port;
    private String path;
    private String suffix;

    public FreeMarkerKit(FreeMarkerConfigurer freeMarkerConfigurer, String host, String port, String path, String suffix) {
        this.freeMarkerConfigurer = freeMarkerConfigurer;
        this.host = host;
        this.port = Integer.parseInt(port);
        this.path = path;
        this.suffix = suffix;
    }

    public FreeMarkerKit(FreeMarkerConfigurer freeMarkerConfigurer, String path, String suffix) {
        this.freeMarkerConfigurer = freeMarkerConfigurer;
        this.path = path;
        this.suffix = suffix;
    }

    public void uploadFreeMarkerPage(String htmlName, String templateName, Map<String,Object> map){

        this.createFreeMarkerPage(htmlName, templateName, map);
        OutputStream os = null;
        InputStream is = null;
        try {
            Socket socket = new Socket(host, port);
            os = socket.getOutputStream();
            is = new FileInputStream(this.path + htmlName + this.suffix);
            byte[] bs = new byte[1024];
            int len= -1;
            while ((len=is.read(bs))!=-1){
                os.write(bs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public void createFreeMarkerPage(String htmlName,String templateName, Map<String,Object> map){
        // 1、从spring容器中获得FreeMarkerConfigurer对象。
        // 2、从FreeMarkerConfigurer对象中获得Configuration对象。
        Configuration configuration = freeMarkerConfigurer.getConfiguration();
        Writer out = null;
        try {
            // 3、使用Configuration对象获得Template对象。
            Template template = configuration.getTemplate(templateName);
            // 4、创建输出文件的Writer对象。
            out = new FileWriter(new File(this.path + htmlName + this.suffix));
            template.process(map, out);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 5、关闭流。
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
