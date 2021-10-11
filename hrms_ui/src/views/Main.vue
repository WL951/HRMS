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
  }
  .el-header{
    background-color: #42b983;
  }
  .el-main{
    background-color: bisque;
  }
</style>
