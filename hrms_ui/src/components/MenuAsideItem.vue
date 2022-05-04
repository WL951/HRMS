<template>
  <div>
    <el-submenu v-if="hasChildren" :index="item.label" :key="index">
      <template slot="title">
        <i :class="'el-icon-' + item.icon"></i>
        <span slot="title">{{ item.label }}</span>
      </template>
      <el-menu-item-group>
        <menu-aside-item v-for="(subItem, subIndex) in item.children" :item="subItem" :key="subIndex"></menu-aside-item>
      </el-menu-item-group>
    </el-submenu>
    <el-menu-item v-else :index="item.path" :key="item.path" @click="clickMenu(item)">
      <i :class="'el-icon-' + item.icon"></i>
      <span slot="title">{{ item.label }}</span>
    </el-menu-item>
  </div>
</template>

<script>
export default {
  name: 'MenuAsideItem',
  props: {
    item: {
      type: Object,
      required: true
    }
  },
  computed: {
    // 判断是否有子菜单
    hasChildren () {
      return Object.keys(this.item.children).length !== 0;
    }
  }
};
</script>

<style scoped>

</style>
