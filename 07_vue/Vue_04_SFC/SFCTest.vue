<template>
  <!-- 최상위 태그를 하나 두자 -->
  <div>
    <h2>SFC 테스트</h2>
    <input type="text" v-model="msg"/>
    <div :class="msg">{{ msg }}</div>
  </div>
</template>

<script setup>
import {ref} from 'vue'
  const msg = ref("")
</script>

<style scoped>
  .red{
    color: red;
  }
  .orange{
    color: orange;
  }
</style>