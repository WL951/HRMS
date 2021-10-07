<template>
  <el-container>
    <el-header>Header</el-header>
    <el-container>
      <el-aside width="200px">
        <navLeft></navLeft>
      </el-aside>
      <el-main>Main</el-main>
    </el-container>
  </el-container>
</template>

<script>
  import navLeft from '@/components/nav/nav-left.vue';
  export default {
    name: 'Layout',
    components: {
      navLeft
    }
  };
</script>

<style>
  .el-container{
    position: absolute;
    width: 100%;
    top: 0px ;
    left: 0 ;
    bottom: 0;
  }
  .el-header{
    padding: 0;
    z-index: 1000;
    background-color: #42b983;
  }
  /*header菜单需要靠右的添加.fr即可(如：<el-menu-item class="fr" index="3">消息中心</el-menu-item>)*/
  .el-header .fr{
    float: right;
  }
  .el-header, .el-menu{
    border-bottom: none;
  }
  .el-aside, .el-main{
    padding-top: 60px;
  }
  .el-aside{
    background: #545c64;
  }
  .el-aside, .el-menu{
    border-right: none;
  }
  .el-main{
    background-color: bisque;
  }
</style>
