<template>
  <div class="menu-aside-logo-container" :class="{'collapse':isCollapse}">
    <transition name="menuAsideLogoFade">
      <router-link v-if="isCollapse" key="collapse" class="menu-aside-logo-link" to="/">
        <img v-if="logo" :src="logo" class="menu-aside-logo">
        <h1 class="sidebar-title">HRMS</h1>
      </router-link>
      <router-link v-else key="expand" class="menu-aside-logo-link" to="/">
        <img v-if="logo" :src="logo" class="menu-aside-logo">
        <h1 class="sidebar-title">人力资源管理</h1>
      </router-link>
    </transition>
  </div>
</template>

<script>
import Logo from '@/assets/images/logo.png';
export default {
  name: 'MenuAsideLogo',
  props: {
    isCollapse: {
      type: Boolean,
      required: true
    }
  },
  data () {
    return {
      logo: Logo
    };
  }
};
</script>

<style lang="scss" scoped>
.menu-aside-logo-container {
  position: relative;
  width: 100%;
  height: 50px;
  line-height: 50px;
  text-align: center;
  overflow: hidden;
  background-color: #1890ff;

  & .menu-aside-logo-link {
    height: 100%;
    width: 100%;

    & .menu-aside-logo {
      width: 32px;
      height: 32px;
      vertical-align: middle;
      margin-right: 6px;
    }

    & .sidebar-title {
      display: inline-block;
      margin: 0;
      color: #fff;
      font-weight: 600;
      line-height: 50px;
      font-size: 14px;
      font-family: Avenir, Helvetica Neue, Arial, Helvetica, sans-serif;
      vertical-align: middle;
    }
  }

  &.collapse {
    .sidebar-logo {
      margin-right: 0px;
    }
  }
}
</style>
