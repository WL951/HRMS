// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue';
import App from './App';
import router from './router';
import ElementUI from 'element-ui'; // 新添加
import 'element-ui/lib/theme-chalk/index.css'; // 新添加，避免后期打包样式不同，要放在import
import store from './store';

Vue.use(ElementUI);// 新添加
Vue.config.productionTip = false;

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
});
