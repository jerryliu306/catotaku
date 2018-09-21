<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>猫宅</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mycss.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/antd.css" />

    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/react.production.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/react-dom.production.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/babel-core/5.8.23/browser.min.js"></script>
    <script src="http://momentjs.com/downloads/moment.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/antd.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/test.js"></script>
</head>
<body>
<div>

    <div class="top">
        <div class="top_top"></div>
        <div class="top_middle">
            <div class="top_left">
                <ul>
                    <li class="red">亲,请登录&nbsp;</li>
                    <li>免费注册&nbsp;</li>
                    <li>手机逛猫宅</li>
                </ul>
            </div>
            <div class="top_right">
                <ul>
                    <li class="red">猫宅首页&nbsp;</li>
                    <li>我的猫宅&nbsp;</li>
                    <li>购物车&nbsp;</li>
                    <li>收藏夹&nbsp;</li>
                    <li>商品分类&nbsp;</li>
                    <li>卖家中心&nbsp;</li>
                    <li>联系客服&nbsp;</li>
                    <li>网站导航</li>
                </ul>
            </div>
        </div>
    </div>
    <div class="top_middle">
        <div class="top_left">
            <img width="280px" src="${pageContext.request.contextPath}/img/taobaoremai.png"/>
        </div>
        <div class="top_middle_select">
            <form action="${pageContext.request.contextPath}/searchName" method="post" enctype="application/x-www-form-urlencoded">
                <input type="text" name="keyword" size="100"/>
                <input type="submit" class="submit" value="  搜索  " /><br />
            </form>
            客厅灯&nbsp;冲锋衣&nbsp;床垫&nbsp;沙发垫&nbsp;电脑桌&nbsp;鞋柜&nbsp;
            窗帘&nbsp;椅子&nbsp;男内裤&nbsp;电脑桌&nbsp;鞋柜&nbsp;窗帘&nbsp;椅子
        </div>
        <div>
            <C:forEach items="${list}" var="commodity">
                ${commodity.id}---${commodity.name}
            </C:forEach>
        </div>
    </div>
    <div class="top_middle_search">
        你是不是想找:客厅灯&nbsp;|&nbsp;冲锋衣&nbsp;|&nbsp;床垫&nbsp;|&nbsp;沙发垫&nbsp;|&nbsp;男内裤&nbsp;|&nbsp;电脑桌
        &nbsp;|&nbsp;鞋柜&nbsp;|&nbsp;窗帘&nbsp;|&nbsp;椅子&nbsp;|&nbsp;男内裤&nbsp;|&nbsp;电脑桌&nbsp;|&nbsp;鞋包
        &nbsp;|&nbsp;窗帘&nbsp;|&nbsp;椅子&nbsp;|
    </div>
    <div>
        <div class="middle_top">
            <div class="middle_top_left">
                价格:<input type="text" name="min_price" />一
                <input type="text" name="max_price" />
            </div>
            <div class="middle_top_right">
                <input type="checkbox" name="1" />包邮&nbsp;
                <input type="checkbox" name="2" />正品包换&nbsp;
                <input type="checkbox" name="3" />7天退换&nbsp;
                <input type="checkbox" name="4" />消费者保障&nbsp;
            </div>
        </div>
        <div class="midlle_shop">
            <div class="shop">
                <img src="${pageContext.request.contextPath}/img/shop (1).png" width="190px" /><br />
                <font class="shop_price">￥ 40.0 包邮</font><br />
                <font class="shop_name">当中国风遇上作文</font><br /><br />
                <font class="shop_store">图书专营店</font><br />
                <font class="shop_ecaluate">如实描述4.8</font>
            </div>
            <div class="shop">
                <img src="${pageContext.request.contextPath}/img/shop (2).png" width="190px" /><br />
                <font class="shop_price">￥ 40.0 包邮</font><br />
                <font class="shop_name">似是古人乘风来</font><br /><br />
                <font class="shop_store">图书专营店</font><br />
                <font class="shop_ecaluate">如实描述4.8</font>
            </div>
            <div class="shop">
                <img src="${pageContext.request.contextPath}/img/shop (3).png" width="190px" /><br />
                <font class="shop_price">￥ 40.0 包邮</font><br />
                <font class="shop_name">带一首诗去远方</font><br /><br />
                <font class="shop_store">图书专营店</font><br />
                <font class="shop_ecaluate">如实描述4.8</font>
            </div>
            <div class="shop">
                <img src="${pageContext.request.contextPath}/img/shop (4).png" width="190px" /><br />
                <font class="shop_price">￥ 40.0 包邮</font><br />
                <font class="shop_name">前方有神气</font><br /><br />
                <font class="shop_store">图书专营店</font><br />
                <font class="shop_ecaluate">如实描述4.8</font>
            </div>
            <div class="shop">
                <img src="${pageContext.request.contextPath}/img/shop (5).png" width="190px" /><br />
                <font class="shop_price">￥ 40.0 包邮</font><br />
                <font class="shop_name">瓦尔登湖</font><br /><br />
                <font class="shop_store">图书专营店</font><br />
                <font class="shop_ecaluate">如实描述4.8</font>
            </div>
            <div class="shop">
                <img src="${pageContext.request.contextPath}/img/shop (6).png" width="190px" /><br />
                <font class="shop_price">￥ 40.0 包邮</font><br />
                <font class="shop_name">人间词话</font><br /><br />
                <font class="shop_store">图书专营店</font><br />
                <font class="shop_ecaluate">如实描述4.8</font>
            </div>
            <div class="shop">
                <img src="${pageContext.request.contextPath}/img/shop (7).png" width="190px" /><br />
                <font class="shop_price">￥ 40.0 包邮</font><br />
                <font class="shop_name">不必去做一个人人都喜欢<br />的姑娘</font><br />
                <font class="shop_store">图书专营店</font><br />
                <font class="shop_ecaluate">如实描述4.8</font>
            </div>
            <div class="shop">
                <img src="${pageContext.request.contextPath}/img/shop (8).png" width="190px" /><br />
                <font class="shop_price">￥ 40.0 包邮</font><br />
                <font class="shop_name">这个世界很美好值得我们<br />去奋斗</font><br />
                <font class="shop_store">图书专营店</font><br />
                <font class="shop_ecaluate">如实描述4.8</font>
            </div>
            <div class="shop">
                <img src="${pageContext.request.contextPath}/img/shop (9).png" width="190px" /><br />
                <font class="shop_price">￥ 40.0 包邮</font><br />
                <font class="shop_name">成大事者高情商</font><br /><br />
                <font class="shop_store">图书专营店</font><br />
                <font class="shop_ecaluate">如实描述4.8</font>
            </div>
            <div class="shop">
                <img src="${pageContext.request.contextPath}/img/shop (10).png" width="190px" /><br />
                <font class="shop_price">￥ 40.0 包邮</font><br />
                <font class="shop_name">教你幽默到心田</font><br /><br />
                <font class="shop_store">图书专营店</font><br />
                <font class="shop_ecaluate">如实描述4.8</font>
            </div>
        </div>
    </div>
    <div id="root"></div>
</div>
<div class="down">
    <div class="down_1">
        <ul id="ul04" >
            <li><a>阿里巴巴集团&nbsp;|&nbsp;</a></li>
            <li><a>阿里巴巴网络：&nbsp;</a></li>
            <li><a>国际站&nbsp;</a></li>
            <li><a>中文站&nbsp;</a></li>
            <li><a>全球速卖通&nbsp;|&nbsp;</a></li>
            <li><a>淘宝网&nbsp;|&nbsp;</a></li>
            <li><a>天猫&nbsp;|&nbsp;</a></li>
            <li><a>一淘&nbsp;|&nbsp;</a></li>
            <li><a>阿里妈妈&nbsp;|&nbsp;</a></li>
            <li><a>阿里云&nbsp;|&nbsp;</a></li>
            <li><a>中国雅虎&nbsp;|&nbsp;</a></li>
            <li><a>支付宝&nbsp;|&nbsp;</a></li>
            <li><a>聚划算&nbsp;|&nbsp;</a></li>
            <li><a>更多</a></li>
        </ul>
    </div>
    <div  class="down_2">
        <ul id="ul04">
            <li><a>关于淘宝&nbsp;</a></li>
            <li><a>合作伙伴&nbsp;</a></li>
            <li><a>营销中心&nbsp;</a></li>
            <li><a>联系客服&nbsp;</a></li>
            <li><a>开放平台&nbsp;</a></li>
            <li><a>诚征英才&nbsp;</a></li>
            <li><a>练习我们&nbsp;</a></li>
            <li><a>网站地图&nbsp;</a></li>
            <li><a>法律声明&nbsp;</a></li>
            <li><a>@copy;2016&nbsp;</a></li>
            <li><a>Taobao.com&nbsp;</a></li>
            <li><a>版权所有&nbsp;</a></li>
        </ul>
    </div>



</div>

</body>
</html>