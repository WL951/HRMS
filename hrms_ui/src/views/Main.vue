<template>
  <el-container>
    <el-aside>
      <nav-menu-aside></nav-menu-aside>
    </el-aside>
    <el-container>
      <el-header>Header</el-header>
      <el-main>Main</el-main>
    </el-container>
  </el-container>
</template>

<script>
  import NavMenuAside from '@/components/NavMenuAside.vue';
  export default {
    name: 'Main',
    components: {
      NavMenuAside
    }
  };
</script>

<style>
  .el-container{
    height: 100%;
  }
  .el-header{
    background-color: #42b983;
  }
  /*header菜单需要靠右的添加.fr即可(如：<el-menu-item class="fr" index="3">消息中心</el-menu-item>)*/

  .el-aside{
    background: #545c64;
  }

  .el-main{
    background-color: bisque;
  }
</style>
