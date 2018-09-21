<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>测试</title>
    <link rel="shortcut icon" href="//s01.mifile.cn/favicon.ico" type="image/x-icon" />
    <link rel="icon" href="//s01.mifile.cn/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/base.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/list.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mycss2.css">
    <script type="text/javascript">var _head_over_time = (new Date()).getTime();</script>
</head>
<body>

<div class="site-topbar">
    <div class="container">
        <div class="topbar-nav">
            <a href="//www.mi.com/index.html" >猫宅商城</a><span class="sep">|</span>
        </div>
        <div class="topbar-cart" id="J_miniCartTrigger">
            <a class="cart-mini" id="J_miniCartBtn" href="//static.mi.com/cart/"><i class="iconfont">&#xe60c;</i>购物车<span class="cart-mini-num J_cartNum"></span></a>
            <div class="cart-menu" id="J_miniCartMenu">
                <div class="loading"><div class="loader"></div></div>
            </div>
        </div>
        <div class="topbar-info" id="J_userInfo">
            <a class="link" href="//order.mi.com/site/login" data-needlogin="true">登录</a><span class="sep">|</span><a class="link" href="https://account.xiaomi.com/pass/register" >注册</a>        </div>
    </div>
</div>
<form id="myform" class="search-form clearfix" action="${pageContext.request.contextPath}/searchIndex" method="post">
<div class="site-header">
    <div class="container">
        <div class="header-logo">
            <a class="logo ir" href="//www.mi.com/index.html" title="小米官网">小米官网</a>
        </div>

        <div class="header-search">

                <input class="search-text" name="keyword" value="${pageInfo.keyword}" >
                <input id="sales" type="hidden" name="sales" value="${pageInfo.sales}">
                <input id="inventory" type="hidden" name="inventory" value="${pageInfo.inventory}">
                <input type="submit" class="search-btn iconfont" value="&#xe616;" />

        </div>
    </div>
</div>
<div class="breadcrumbs">
    <div class="container">
        <a href='//www.mi.com/index.html'>首页</a><span class="sep">&gt;</span><a href="javascript:void(0)">全部结果</a><span class="sep">&gt;</span><span>${pageInfo.keyword}</span>    </div>
</div>
<div class="container">
    <div class="filter-box">
        <div class="filter-list-wrap">
            <dl class="filter-list clearfix">
                <dt>分类：</dt>
                <dd class="active">全部</dd>
                <dd ><a href="javascript:void(0)">贴膜</a></dd>
                <dd ><a href="javascript:void(0)">手机</a></dd>
            </dl>
        </div>
    </div>
</div>
<div class="content">
    <div class="container">
        <div class="order-list-box clearfix">
            <ul class="order-list">
                <li class="active first"><a href="javascript:void(0)" rel="nofollow">推荐</a></li>
                <li ><a href="javascript:void(0)" rel="nofollow">新品</a></li>
                <li class="up"><a href="javascript:void(0)" rel="nofollow" >价格 <i class="iconfont"><img height="13px" width="10px" src="${pageContext.request.contextPath}/img/up.png"></i></a></li>
            </ul>
            <ul class="type-list">
                <c:if test="${pageInfo.sales==1}">
                    <li><div class="sales-checkbox"><a href="javascript:void(0)"  rel="nofollow"><span class="checkbox checkbox-checked"><i class="iconfont">&#x221a;</i></span>仅显示特惠商品</a></div></li>
                </c:if>
                <c:if test="${pageInfo.sales!=1}">
                    <li><div class="sales-checkbox"><a href="javascript:void(0)"  rel="nofollow"><span class="checkbox"><i class="iconfont">&#x221a;</i></span>仅显示特惠商品</a></div></li>
                </c:if>
                <c:if test="${pageInfo.inventory==1}">
                    <li><div class="inventory-checkbox"><a href="javascript:void(0)"  rel="nofollow"><span class="checkbox checkbox-checked"><i class="iconfont">&#x221a;</i></span>仅显示有货商品</a></div></li>
                </c:if>
                <c:if test="${pageInfo.inventory!=1}">
                    <li><div class="inventory-checkbox"><a href="javascript:void(0)" rel="nofollow"><span class="checkbox"><i class="iconfont">&#x221a;</i></span>仅显示有货商品</a></div></li>
                </c:if>

            </ul>
        </div>
        <div class="goods-list-box" id="pp">
            <div class="goods-list clearfix">


                <div class="goods-item" data-productid="7895">
                    <div class="figure figure-img">
                        <a href="https://www.mi.com/mi6x/?cfrom=search"><img src="${pageContext.request.contextPath}/static/picture/pms_1524621215.02256716!200x200.jpg" width="200" height="200" alt="" /></a>
                    </div>
                    <p class="desc"></p>                    <h2 class="title"><a href="https://www.mi.com/mi6x/?cfrom=search">小米6X 全网通版 6GB内存 64GB</a></h2>
                    <p class="price">1599元 <del>1799元</del></p>
                    <div class="thumbs">
                        <ul class="thumb-list">
                            <li data-commodityid="1181500030" data-config='{
                            "cid":"1181500030","gid":"0","discount":"9","price":"1599\u5143 <del>1799\u5143<\/del>","new":0,"is-cos":0,"package":1,"hasgift":1,"postfree":0,"postfreenum":1,"cfrom":"search"}'><a><img src="static/picture/pms_1524621215.02256716!34x34.jpg" width="34" height="34" title="小米6X 全网通版 6GB内存 64GB 冰川蓝" alt="小米6X 全网通版 6GB内存 64GB 冰川蓝" /></a></li><li data-commodityid="1181500031" data-config='{"cid":"1181500031","gid":"2181500031","discount":"9","price":"1599\u5143 <del>1799\u5143<\/del>","new":0,"is-cos":0,"package":0,"hasgift":1,"postfree":0,"postfreenum":1,"cfrom":"search"}'><a><img src="static/picture/pms_1524621219.48895957!34x34.jpg" width="34" height="34" title="小米6X 全网通版 6GB内存 64GB 流沙金" alt="小米6X 全网通版 6GB内存 64GB 流沙金" /></a></li><li data-commodityid="1181500032" data-config='{"cid":"1181500032","gid":"2181500032","discount":"9","price":"1599\u5143 <del>1799\u5143<\/del>","new":0,"is-cos":0,"package":0,"hasgift":1,"postfree":0,"postfreenum":1,"cfrom":"search"}'><a><img src="static/picture/pms_1524621222.66011593!34x34.jpg" width="34" height="34" title="小米6X 全网通版 6GB内存 64GB 曜石黑" alt="小米6X 全网通版 6GB内存 64GB 曜石黑" /></a></li><li data-commodityid="1181500033" data-config='{"cid":"1181500033","gid":"2181500033","discount":"9","price":"1599\u5143 <del>1799\u5143<\/del>","new":0,"is-cos":0,"package":0,"hasgift":1,"postfree":0,"postfreenum":1,"cfrom":"search"}'><a><img src="static/picture/pms_1524621225.83162698!34x34.jpg" width="34" height="34" title="小米6X 全网通版 6GB内存 64GB 赤焰红" alt="小米6X 全网通版 6GB内存 64GB 赤焰红" /></a></li><li data-commodityid="1181500034" data-config='{"cid":"1181500034","gid":"2181500034","discount":"9","price":"1599\u5143 <del>1799\u5143<\/del>","new":0,"is-cos":0,"package":0,"hasgift":1,"postfree":0,"postfreenum":1,"cfrom":"search"}'><a><img src="static/picture/pms_1524621229.56695068!34x34.jpg" width="34" height="34" title="小米6X 全网通版 6GB内存 64GB 樱花粉" alt="小米6X 全网通版 6GB内存 64GB 樱花粉" /></a></li>                        </ul>
                    </div>
                    <div class="actions clearfix">
                        <a class="btn-like J_likeGoods" data-cid="1181500030" href="javascript: void(0);"><i class="iconfont">&#xe62d;</i> <span>喜欢</span></a>
                        <a class="btn-buy btn-buy-detail J_buyGoods" data-cid="1181500030" href="javascript:void(0)"><span>查看详情</span> <i class="iconfont">&#xe60a;</i></a>                    </div>
                    <div class="flags">
                        <div class="flag flag-saleoff">9折促销</div><div class="flag flag-gift">有赠品</div>                    </div>
                    <div class="notice"></div>
                </div>

                <c:forEach items="${list}" var="commodityVO">
                    <div class="goods-item">
                        <div class="figure figure-img">
                            <a href="${pageContext.request.contextPath}/serchCommodity?id=${commodityVO.id}"><img src="${commodityVO.prictureUrl}" width="200" height="200" alt="" /></a>
                        </div>
                        <p class="desc">==-----==</p>
                        <h2 class="title"><a href="${pageContext.request.contextPath}/searchItem?id=${commodityVO.id}">${commodityVO.name}</a></h2>
                        <p class="price">${commodityVO.price} <del>${commodityVO.salesprice}</del></p>
                        <div class="thumbs">
                        </div>
                        <div class="actions clearfix">
                            <a class="btn-like J_likeGoods" data-cid="1181600007" href="javascript: void(0);"><i class="iconfont">&#xe62d;</i> <span>喜欢</span></a>
                            <a class="btn-buy btn-buy-detail J_buyGoods" data-cid="1181600007" href="javascript:void(0)"><span>查看详情</span> <i class="iconfont">&#xe60a;</i></a>                    </div>
                        <div class="flags">
                            <div class="flag flag-new">新品上架</div>
                        </div>
                        <div class="notice"></div>
                    </div>
                </c:forEach>

            </div>
            <%--<div class="news">--%>
            <%--<div class="content wide" id="allNews"></div>--%>
            <%--<div id="newsPage"></div>--%>
            <%--</div>--%>
            <div class="pages goods-list clearfix">
                <c:if test="${pageInfo.pageNum==1}">
                    <a class="active" href="javascript:void(0)">上一页</a>
                    <c:forEach begin="${pageInfo.pageNum-1}" end="${pageInfo.pageNum+2}" step="1" var="x">
                        <c:if test="${x>0}">
                            <c:if test="${x<=pageInfo.pageCount}">
                                <a href="javascript:void(0)" class="searchPageNum" title="${x}">${x}</a>
                            </c:if>
                        </c:if>
                    </c:forEach>
                </c:if>
                <c:if test="${pageInfo.pageNum!=1}">
                    <a href="javascript:void(0)"  class="searchPageNum" title="1">上一页</a>
                    <c:forEach begin="${pageInfo.pageNum-2}" end="${pageInfo.pageNum+2}" step="1" var="x">
                        <c:if test="${x>0}">
                            <c:if test="${x<=pageInfo.pageCount}">
                                <a href="javascript:void(0)" class="searchPageNum" title="${x}">${x}</a>
                            </c:if>
                        </c:if>
                    </c:forEach>
                </c:if>
                <c:if test="${pageInfo.pageNum==pageInfo.pageCount}">
                    <a class="active" href="javascript:void(0)">下一页</a>
                </c:if>
                <c:if test="${pageInfo.pageNum!=pageInfo.pageCount}">
                    <a href="javascript:void(0)" class="searchPageNum" title="${pageInfo.pageCount}">下一页</a>
                </c:if>
                <input id="pageNum" type="number" name="pageNum" step="1" min="1" max="${pageInfo.pageCount}" value="${pageInfo.pageNum}"/>
                <span id="searchPage"><a href="javascript:void(0)">确定</a></span>
            </div>

        </div>
    </div>
</div>
</form>
<div class="site-info">
    <div class="container">
        <div class="logo ir">小米官网</div>
        <div class="info-text">
            <p>&copy;<a href="//www.mi.com/" target="_blank" title="mi.com">mi.com</a> 京ICP证110507号 <a href="http://www.miitbeian.gov.cn/"  target="_blank" rel="nofollow">京ICP备10046444号</a> <a rel="nofollow"  href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=11010802020134" target="_blank">京公网安备11010802020134号 </a><a rel="nofollow"  href="//i8.mifile.cn/b2c-mimall-media/63cbc1342511938fc1395113f81324c4.jpg" target="_blank" rel="nofollow">京网文[2017]1530-131号</a>

                <br> 违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</p>
        </div>
        <div class="info-links">
            <a href="javascript:void(0)" target="_blank"><img src="static/picture/truste.png" alt="TRUSTe Privacy Certification" /></a>
            <a href="javascript:void(0)" target="_blank"><img src="static/picture/v-logo-2.png" alt="诚信网站" /></a>
            <a href="javascript:void(0)" target="_blank"><img src="static/picture/v-logo-1.png" alt="可信网站" /></a>
            <a href="javascript:void(0)" target="_blank"><img src="static/picture/v-logo-3.png" alt="网上交易保障中心" /></a>
            <a href="h" target="_blank"><img src="static/picture/ba10428a4f9495ac310fd0b5e0cf8370.png" alt="诚信经营 放心消费" /></a>
        </div>
    </div>
    <div class="slogan ir">探索黑科技，小米为发烧而生</div>
</div>
<div id="J_modalWeixin" class="modal fade modal-hide modal-weixin" data-width="480" data-height="520">
    <div class="modal-hd">
        <a class="close" data-dismiss="modal"><i class="iconfont">&#xe602;</i></a>
        <span class="title">小米手机官方微信二维码</span>
    </div>
    <div class="modal-bd">
        <img alt="" src="static/picture/weixin.jpg" width="680" height="340" />
    </div>
</div>
<!-- .modal-weixin END -->
<div class="modal modal-hide modal-bigtap-queue" id="J_bigtapQueue">
    <div class="modal-body">
        <span class="close" data-dismiss="modal" aria-hidden="true">退出排队</span>
        <div class="con">
            <div class="title">正在排队，请稍候喔！</div>
            <div class="queue-tip-box">
                <p class="queue-tip">当前人数较多，请您耐心等待，排队期间请不要关闭页面。</p>
                <p class="queue-tip">时常来官网看看，最新产品和活动信息都会在这里发布。</p>
                <p class="queue-tip">下载小米商城 App 玩玩吧！产品开售信息抢先知道。</p>
                <p class="queue-tip">发现了让你眼前一亮的小米产品，别忘了分享给朋友！</p>
                <p class="queue-tip">产品开售前会有预售信息，关注官网首页就不会错过。</p>
            </div>
        </div>

        <div class="queue-posters">
            <div class="poster poster-3"></div>
            <div class="poster poster-2"></div>
            <div class="poster poster-1"></div>
            <div class="poster poster-4"></div>
            <div class="poster poster-5"></div>
        </div>
    </div>
</div>
<!-- .xm-dm-queue END -->

<!-- .xm-dm-error END -->
<div id="J_modal-globalSites" class="modal fade modal-hide modal-globalSites" data-width="640">
    <div class="modal-hd">
        <a class="close" data-dismiss="modal"><i class="iconfont">&#xe602;</i></a>
        <span class="title">Select Region</span>
    </div>
    <div class="modal-bd">
        <h3>Welcome to Mi.com</h3>
        <p class="modal-globalSites-tips">Please select your country or region</p>
        <p class="modal-globalSites-links clearfix">
            <a href="//www.mi.com/index.html">Mainland China</a>
            <a href="//www.mi.com/hk/">Hong Kong</a>
            <a href="//www.mi.com/tw/">Taiwan</a>
            <a href="//www.mi.com/sg/">Singapore</a>
            <a href="//www.mi.com/my/">Malaysia</a>
            <a href="//www.mi.com/ph/">Philippines</a>
            <a href="//www.mi.com/in/">India</a>
            <a href="//www.mi.com/id/">Indonesia</a>
            <a href="//www.mi.com/en/">Global Home</a>
            <a href="//www.mi.com/mena/">MENA</a>
            <a href="//www.mi.com/pl/">Poland</a>
            <a href="//www.mi.com/ua/">Ukraine</a>
            <a href="//www.mi.com/ru/">Russia</a>
            <a href="//www.mi.com/vn/">Vietnam</a>
            <a href="//www.mi.com/mx/">Mexico</a>
            <a href="//www.mi.com/kr/">Korea</a>
            <a href="//www.mi.com/eg/">Egypt</a>
            <a href="//www.mi.com/th/">Thailand</a>
            <a href="//www.mi.com/es/">Spain</a>
            <a href="//www.mi.com/us/">United States</a>
            <a href="//www.mi.com/it/">Italy</a>
            <a href="//www.mi.com/fr/index.html">France</a>
            <a href="//www.mi.com/bd/">Bangladesh</a>
        </p>
    </div>
</div>
<!-- .modal-globalSites END -->
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/layui.js"></script>

<script>
    $(function () {
        $(".searchPageNum").on('click',function () {
            let num = $(this).attr("title");
            $("#pageNum").val(num);
            $("#myform").submit();
        });


        $(".sales-checkbox").on('click',function () {
            let sales = $("#sales").val();
            if (sales==1){
                $("#sales").val("0");
            }else{
                $("#sales").val("1");
            }
            $("#myform").submit();
        });
        $(".inventory-checkbox").on('click',function () {
            let inventory = $("#inventory").val();
            if (inventory==1){
                $("#inventory").val("0");
            }else{
                $("#inventory").val("1");
            }
            $("#myform").submit();
        });
        $("#searchPage").on('click',function () {
            $("#myform").submit();
        });


    });
</script>


<script src="${pageContext.request.contextPath}/static/js/base.min.js"></script>

<script>
    (function() {
        MI.namespace('GLOBAL_CONFIG');
        MI.GLOBAL_CONFIG = {
            orderSite: '//order.mi.com',
            wwwSite: '//www.mi.com',
            cartSite: '//cart.mi.com',
            itemSite: '//item.mi.com',
            assetsSite: '//s01.mifile.cn',
            listSite: '//list.mi.com',
            searchSite: '//search.mi.com',
            mySite: '//my.mi.com',
            damiaoSite: '//tp.hd.mi.com/',
            damiaoGoodsId: [],
            logoutUrl: '//order.mi.com/site/logout',
            staticSite: '//static.mi.com',
            quickLoginUrl: 'https://account.xiaomi.com/pass/static/login.html'
        };
        MI.setLoginInfo.orderUrl = MI.GLOBAL_CONFIG.orderSite + '/user/order';
        MI.setLoginInfo.logoutUrl = MI.GLOBAL_CONFIG.logoutUrl;
        MI.setLoginInfo.init(MI.GLOBAL_CONFIG);
        MI.miniCart.init();
        MI.updateMiniCart();
    })();
</script>


<script>
    var SITE_ID = "Search";
    var SEARCH_WORDS = "小米6x";
    var HongBaoHost = "//i.huodong.mi.com";
</script>
<script src="${pageContext.request.contextPath}/static/js/goodslist.min.js"></script>
<script>
    var _msq = _msq || [];
    _msq.push(['setDomainId', 100]);
    _msq.push(['trackPageView']);
    (function() {
        var ms = document.createElement('script');
        ms.type = 'text/javascript';
        ms.async = true;
        ms.src = '//s1.mi.com/stat/18/xmst.js';
        var s = document.getElementsByTagName('script')[0];
        s.parentNode.insertBefore(ms, s);
    })();
</script>
</body>
</html>


