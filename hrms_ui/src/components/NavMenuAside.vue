<template>
  <el-menu
    class="el-menu-vertical-demo"
    :collapse="isCollapse">
    <div class="logo">
      <h3 v-show="isCollapse">HRMS</h3>
      <h3 v-show="!isCollapse">人力资源管理</h3>
    </div>
    <div class="logo-hidden">
      <h3 v-show="isCollapse">HRMS</h3>
      <h3 v-show="!isCollapse">人力资源管理</h3>
    </div>
    <el-menu-item :index="item.path" v-for="item in noChildren" :key="item.path" @click="clickMenu(item)">
      <i :class="'el-icon-' + item.icon"></i>
      <span slot="title">{{ item.label }}</span>
    </el-menu-item>
    <el-submenu :index="item.label" v-for="(item, index) in hasChildren" :key="index">
      <template slot="title">
        <i :class="'el-icon-' + item.icon"></i>
        <span slot="title">{{ item.label }}</span>
      </template>
      <el-menu-item-group>
        <el-menu-item :index="subItem.path" v-for="(subItem, subIndex) in item.children" :key="subIndex" @click="clickMenu(subItem)">
          <i :class="'el-icon-' + subItem.icon"></i>
          <span slot="title">{{ subItem.label }}</span>
        </el-menu-item>
      </el-menu-item-group>
    </el-submenu>
  </el-menu>
</template>

<script>
  export default {
    // 计算属性
    computed: {
      // 没有子菜单
      noChildren () {
        return this.menu.filter(item => !item.children);
      },
      // 有子菜单 (这样设置会有一个问题 就是有子菜单的 永远会在没有子菜单的下面）
      hasChildren () {
        return this.menu.filter(item => item.children);
      },
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
            url: 'UserManage/UserManage'
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
                url: 'Other/PageOne'
              },
              {
                path: '/page2',
                name: 'page2',
                label: '页面2',
                icon: 'setting',
                url: 'Other/PageTwo'
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
    height: 60px;
    background-color: palevioletred;
  }
  .el-menu-vertical-demo .logo{
    position: fixed;
  }
</style>
