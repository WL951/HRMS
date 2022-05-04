<template>
  <el-menu
    class="el-menu-vertical-demo"
    :collapse="isCollapse">
    <menu-aside-logo :isCollapse="isCollapse"></menu-aside-logo>
    <menu-aside-item v-for="(item, index) in menu" :item="item" :key="index"></menu-aside-item>
  </el-menu>
</template>

<script>
  import MenuAsideLogo from '@/components/MenuAsideLogo';
  import MenuAsideItem from '@/components/MenuAsideItem';
  export default {
    name: 'NavMenuAside',
    components: {
      MenuAsideLogo,
      MenuAsideItem
    },
    // 计算属性
    computed: {
      isCollapse () {
        // 这里的数据就是从vuex取得
        return this.$store.state.tab.isCollapse;
      }
    },
    data () {
      return {
        menu: [
          {
            path: '/user',
            name: 'user',
            label: '用户管理',
            icon: 'user',
            url: 'UserManage/UserManage',
            children: []
          },
          {
            label: '测试',
            icon: 'user',
            children: [
              {
                label: '测试1',
                icon: 'user',
                children: [
                  {
                    path: '/user',
                    name: 'user',
                    label: '测试2',
                    icon: 'user',
                    url: 'UserManage/UserManage'
                  }
                ]
              }
            ]
          },
          {
            label: '其他',
            icon: 'location',
            children: [
              {
                path: '/page1',
                name: 'page1',
                label: '页面1',
                icon: 'setting',
                url: 'Other/PageOne',
                children: []
              },
              {
                path: '/page2',
                name: 'page2',
                label: '页面2',
                icon: 'setting',
                url: 'Other/PageTwo',
                children: []
              }
            ]
          }
        ]
      };
    },
    methods: {
      // 跳转路由 根据名称跳转
      clickMenu (item) {
        this.$router.push({ name: item.name });
      }
    }
  };
</script>

<style>
  .el-menu-vertical-demo .logo, .el-menu-vertical-demo .logo-hidden{
    width: 100%;
    z-index: 1000;
    background-color: palevioletred;
  }
  .el-menu-vertical-demo .logo{
    position: fixed;
  }
</style>
