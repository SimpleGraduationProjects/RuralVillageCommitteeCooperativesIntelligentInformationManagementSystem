
var projectName = '农村村委合作社智能信息化管理系统';
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
]


var indexNav = [

{
	name: '村委会成员',
	url: './pages/cunweihuichengyuan/list.html'
}, 
{
	name: '合作社成员',
	url: './pages/hezuoshechengyuan/list.html'
}, 
{
	name: '商品信息',
	url: './pages/shangpinxinxi/list.html'
}, 

]

var adminurl =  "http://localhost:8080/ssm6b9uv/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"村委会成员","menuJump":"列表","tableName":"cunweihuichengyuan"}],"menu":"村委会成员管理"},{"child":[{"buttons":["新增","查看","修改","删除","户耕作登记"],"menu":"村民","menuJump":"列表","tableName":"cunmin"}],"menu":"村民管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"户耕作登记","menuJump":"列表","tableName":"hugengzuodengji"}],"menu":"户耕作登记管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"任务","menuJump":"列表","tableName":"renwu"}],"menu":"任务管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"事务","menuJump":"列表","tableName":"shiwu"}],"menu":"事务管理"},{"child":[{"buttons":["新增","查看","修改","删除","党员变动"],"menu":"党员信息","menuJump":"列表","tableName":"dangyuanxinxi"}],"menu":"党员信息管理"},{"child":[{"buttons":["查看","修改","删除","新增"],"menu":"发展党员","menuJump":"列表","tableName":"fazhandangyuan"}],"menu":"发展党员管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"党员变动","menuJump":"列表","tableName":"dangyuanbiandong"}],"menu":"党员变动管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"合作社成员","menuJump":"列表","tableName":"hezuoshechengyuan"}],"menu":"合作社成员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"供应商","menuJump":"列表","tableName":"gongyingshang"}],"menu":"供应商管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"商品信息","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息管理"},{"child":[{"buttons":["查看","修改","删除","预购成交"],"menu":"预购登记","menuJump":"列表","tableName":"yugoudengji"}],"menu":"预购登记管理"},{"child":[{"buttons":["查看","修改","删除","预售成交"],"menu":"预售登记","menuJump":"列表","tableName":"yushoudengji"}],"menu":"预售登记管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"预购成交","menuJump":"列表","tableName":"yugouchengjiao"}],"menu":"预购成交管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"预售成交","menuJump":"列表","tableName":"yushouchengjiao"}],"menu":"预售成交管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"商品库存","menuJump":"列表","tableName":"shangpinkucun"}],"menu":"商品库存管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"期间采购统计","menuJump":"列表","tableName":"qijiancaigoutongji"}],"menu":"期间采购统计管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"期间销售统计","menuJump":"列表","tableName":"qijianxiaoshoutongji"}],"menu":"期间销售统计管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"收入信息","menuJump":"列表","tableName":"shouruxinxi"}],"menu":"收入信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"支出信息","menuJump":"列表","tableName":"zhichuxinxi"}],"menu":"支出信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"民族","menuJump":"列表","tableName":"minzu"}],"menu":"民族管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学历","menuJump":"列表","tableName":"xueli"}],"menu":"学历管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"村委会成员列表","menuJump":"列表","tableName":"cunweihuichengyuan"}],"menu":"村委会成员模块"},{"child":[{"buttons":["查看"],"menu":"合作社成员列表","menuJump":"列表","tableName":"hezuoshechengyuan"}],"menu":"合作社成员模块"},{"child":[{"buttons":["查看","预购登记","预售登记"],"menu":"商品信息列表","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"户耕作登记","menuJump":"列表","tableName":"hugengzuodengji"}],"menu":"户耕作登记管理"},{"child":[{"buttons":["查看","删除"],"menu":"预购登记","menuJump":"列表","tableName":"yugoudengji"}],"menu":"预购登记管理"},{"child":[{"buttons":["查看","删除"],"menu":"预售登记","menuJump":"列表","tableName":"yushoudengji"}],"menu":"预售登记管理"},{"child":[{"buttons":["查看"],"menu":"预购成交","menuJump":"列表","tableName":"yugouchengjiao"}],"menu":"预购成交管理"},{"child":[{"buttons":["查看"],"menu":"预售成交","menuJump":"列表","tableName":"yushouchengjiao"}],"menu":"预售成交管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"村委会成员列表","menuJump":"列表","tableName":"cunweihuichengyuan"}],"menu":"村委会成员模块"},{"child":[{"buttons":["查看"],"menu":"合作社成员列表","menuJump":"列表","tableName":"hezuoshechengyuan"}],"menu":"合作社成员模块"},{"child":[{"buttons":["查看","预购登记","预售登记"],"menu":"商品信息列表","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"村民","tableName":"cunmin"}]


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
