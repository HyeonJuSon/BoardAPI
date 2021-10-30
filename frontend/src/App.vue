<template>
  <div>
    <Header />
    <div class="app">
      <router-view></router-view>
    </div>
    <Footer />
  </div>
</template>

<script>
import Header from './components/Header.vue'
import Footer from './components/Footer.vue'
export default {
  name: 'App',
  components: {
    Header,
    Footer,
  },
}
</script>

<style>
* {
  padding: 0;
  margin: 0;
}

.app {
  min-height: 50vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-content: center;
}
</style>
