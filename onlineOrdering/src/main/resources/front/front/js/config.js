
var projectName = '网上点餐系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的订单',
	url: '../shop-order/list.html'
},

{
	name: '我的地址',
	url: '../shop-address/list.html'
},

{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '店铺信息',
	url: './pages/dianpuxinxi/list.html'
}, 
{
	name: '餐桌信息',
	url: './pages/canzhuoxinxi/list.html'
}, 
{
	name: '菜品信息',
	url: './pages/caipinxinxi/list.html'
}, 

{
	name: '通知公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootz5055/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


cartFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除"],"menu":"店铺信息","menuJump":"列表","tableName":"dianpuxinxi"}],"menu":"店铺信息管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"餐桌信息","menuJump":"列表","tableName":"canzhuoxinxi"}],"menu":"餐桌信息管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","删除","审核"],"menu":"用户占座","menuJump":"列表","tableName":"yonghuzhanzuo"}],"menu":"用户占座管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","删除","审核"],"menu":"取消占座","menuJump":"列表","tableName":"quxiaozhanzuo"}],"menu":"取消占座管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除"],"menu":"菜品分类","menuJump":"列表","tableName":"caipinfenlei"}],"menu":"菜品分类管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除","查看评论"],"menu":"菜品信息","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"通知公告","tableName":"news"},{"appFrontIcon":"cuIcon-rank","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除","物流"],"menu":"已退款订单","tableName":"orders/已退款"},{"appFrontIcon":"cuIcon-time","buttons":["查看","删除","物流","日销量","月销量","品销量","日销额","月销额","品销额"],"menu":"已完成订单","tableName":"orders/已完成"},{"appFrontIcon":"cuIcon-copy","buttons":["查看","删除","物流"],"menu":"已发货订单","tableName":"orders/已发货"},{"appFrontIcon":"cuIcon-newshot","buttons":["查看","删除"],"menu":"未支付订单","tableName":"orders/未支付"},{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","删除"],"menu":"已取消订单","tableName":"orders/已取消"},{"appFrontIcon":"cuIcon-circle","buttons":["查看","删除","发货"],"menu":"已支付订单","tableName":"orders/已支付"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看"],"menu":"店铺信息列表","menuJump":"列表","tableName":"dianpuxinxi"}],"menu":"店铺信息模块"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","用户占座"],"menu":"餐桌信息列表","menuJump":"列表","tableName":"canzhuoxinxi"}],"menu":"餐桌信息模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","购物车"],"menu":"菜品信息列表","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","取消占座"],"menu":"用户占座","menuJump":"列表","tableName":"yonghuzhanzuo"}],"menu":"用户占座管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"取消占座","menuJump":"列表","tableName":"quxiaozhanzuo"}],"menu":"取消占座管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看"],"menu":"店铺信息列表","menuJump":"列表","tableName":"dianpuxinxi"}],"menu":"店铺信息模块"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","用户占座"],"menu":"餐桌信息列表","menuJump":"列表","tableName":"canzhuoxinxi"}],"menu":"餐桌信息模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","购物车"],"menu":"菜品信息列表","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
