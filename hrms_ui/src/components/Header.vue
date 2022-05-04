<template>
  <div class="navbar">
    <div class="l-content">
      <!-- <el-button plain icon="el-icon-menu" size="mini" @click="collapseMenu"></el-button>-->
      <hamburger id="hamburger-container" :is-activ="true" class="hamburger-container"></hamburger>
    </div>
    <div class="r-content">
      <!--<el-dropdown trigger="click" size="mini">-->
        <!--<span class="el-dropdown-link"><img :src="userImg" class="user"/></span>-->
        <!--<el-dropdown-menu slot="dropdown">-->
          <!--<el-dropdown-item>个人中心</el-dropdown-item>-->
          <!--<el-dropdown-item @click.native="logOut">退出</el-dropdown-item>-->
        <!--</el-dropdown-menu>-->
      <!--</el-dropdown>-->
    </div>
  </div>
</template>

<script>
  import Hamburger from '@/components/Hamburger/Hamburger';
  export default {
    components: {
      Hamburger
    }
  };
</script>

<style lang="scss">
.navbar {
  height: 50px;
  overflow: hidden;
  position: relative;
  box-shadow: 0 1px 4px rgba(0, 21, 41, .08);
  background-color: #1890ff;

  .hamburger-container {
    line-height: 46px;
    height: 100%;
    float: left;
    cursor: pointer;
    transition: background .3s;
    -webkit-tap-highlight-color:transparent;

    &:hover {
      background: rgba(0, 0, 0, .025)
    }
  }
}
</style>
