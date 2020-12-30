import Vue from 'vue';
import Router from 'vue-router';
import Layout from '@/page/layout';

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Layout',
      component: Layout
    }
  ]
});
