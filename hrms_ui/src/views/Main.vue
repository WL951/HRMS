<template>
  <el-container>
    <el-aside width="auto">
      <nav-menu-aside></nav-menu-aside>
    </el-aside>
    <el-container>
      <el-header>
        <top-header></top-header>
      </el-header>
      <el-main>Main</el-main>
    </el-container>
  </el-container>
</template>

<script>
  import TopHeader from '@/components/Header.vue';
  import NavMenuAside from '@/components/NavMenuAside.vue';
  export default {
    name: 'Main',
    components: {
      TopHeader,
      NavMenuAside
    }
  };
</script>

<style>
  .el-container{
    height: 100%;
  }
  .el-aside{
    background: #545c64;
    transition: width 1s;
  }
  .el-header{
    z-index: 1001; /* 头部的z-index必须要大于菜单栏头部的z-index，否则会菜单栏头部会覆盖头部 */
  }
  .el-main{
    background-color: bisque;
  }
</style>
