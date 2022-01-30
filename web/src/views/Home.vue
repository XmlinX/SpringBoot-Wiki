<template>
  <div class="home">
      <a-row>
        <a-col :span="12">
          <a-statistic title="Active Users" :value="112893" style="margin-right: 50px" />
        </a-col>
        <a-col :span="12">
          <a-statistic title="Account Balance (CNY)" :precision="2" :value="112893" />
        </a-col>
      </a-row>
    <img alt="Vue logo" src="../assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js + TypeScript App"/>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import HelloWorld from '@/components/HelloWorld.vue'; // @ is an alias to /src

export default defineComponent({
  name: 'Home',
  components: {
    HelloWorld,
  },
});
</script>
