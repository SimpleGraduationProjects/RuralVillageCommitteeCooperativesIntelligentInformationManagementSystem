import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import dangyuanxinxi from '@/views/modules/dangyuanxinxi/list'
    import cunmin from '@/views/modules/cunmin/list'
    import gongyingshang from '@/views/modules/gongyingshang/list'
    import cunweihuichengyuan from '@/views/modules/cunweihuichengyuan/list'
    import yushouchengjiao from '@/views/modules/yushouchengjiao/list'
    import shangpinkucun from '@/views/modules/shangpinkucun/list'
    import shangpinxinxi from '@/views/modules/shangpinxinxi/list'
    import hugengzuodengji from '@/views/modules/hugengzuodengji/list'
    import dangyuanbiandong from '@/views/modules/dangyuanbiandong/list'
    import fazhandangyuan from '@/views/modules/fazhandangyuan/list'
    import zhichuxinxi from '@/views/modules/zhichuxinxi/list'
    import renwu from '@/views/modules/renwu/list'
    import shouruxinxi from '@/views/modules/shouruxinxi/list'
    import hezuoshechengyuan from '@/views/modules/hezuoshechengyuan/list'
    import qijiancaigoutongji from '@/views/modules/qijiancaigoutongji/list'
    import xueli from '@/views/modules/xueli/list'
    import qijianxiaoshoutongji from '@/views/modules/qijianxiaoshoutongji/list'
    import shiwu from '@/views/modules/shiwu/list'
    import yugouchengjiao from '@/views/modules/yugouchengjiao/list'
    import yushoudengji from '@/views/modules/yushoudengji/list'
    import minzu from '@/views/modules/minzu/list'
    import yugoudengji from '@/views/modules/yugoudengji/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/dangyuanxinxi',
        name: '党员信息',
        component: dangyuanxinxi
      }
      ,{
	path: '/cunmin',
        name: '村民',
        component: cunmin
      }
      ,{
	path: '/gongyingshang',
        name: '供应商',
        component: gongyingshang
      }
      ,{
	path: '/cunweihuichengyuan',
        name: '村委会成员',
        component: cunweihuichengyuan
      }
      ,{
	path: '/yushouchengjiao',
        name: '预售成交',
        component: yushouchengjiao
      }
      ,{
	path: '/shangpinkucun',
        name: '商品库存',
        component: shangpinkucun
      }
      ,{
	path: '/shangpinxinxi',
        name: '商品信息',
        component: shangpinxinxi
      }
      ,{
	path: '/hugengzuodengji',
        name: '户耕作登记',
        component: hugengzuodengji
      }
      ,{
	path: '/dangyuanbiandong',
        name: '党员变动',
        component: dangyuanbiandong
      }
      ,{
	path: '/fazhandangyuan',
        name: '发展党员',
        component: fazhandangyuan
      }
      ,{
	path: '/zhichuxinxi',
        name: '支出信息',
        component: zhichuxinxi
      }
      ,{
	path: '/renwu',
        name: '任务',
        component: renwu
      }
      ,{
	path: '/shouruxinxi',
        name: '收入信息',
        component: shouruxinxi
      }
      ,{
	path: '/hezuoshechengyuan',
        name: '合作社成员',
        component: hezuoshechengyuan
      }
      ,{
	path: '/qijiancaigoutongji',
        name: '期间采购统计',
        component: qijiancaigoutongji
      }
      ,{
	path: '/xueli',
        name: '学历',
        component: xueli
      }
      ,{
	path: '/qijianxiaoshoutongji',
        name: '期间销售统计',
        component: qijianxiaoshoutongji
      }
      ,{
	path: '/shiwu',
        name: '事务',
        component: shiwu
      }
      ,{
	path: '/yugouchengjiao',
        name: '预购成交',
        component: yugouchengjiao
      }
      ,{
	path: '/yushoudengji',
        name: '预售登记',
        component: yushoudengji
      }
      ,{
	path: '/minzu',
        name: '民族',
        component: minzu
      }
      ,{
	path: '/yugoudengji',
        name: '预购登记',
        component: yugoudengji
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
