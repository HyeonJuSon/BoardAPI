<template>
  <div class="container flex flex-col content-center">
    <div class="flex flex-row content-between">
      <div class="menu flex flex-col content-center t-left" @click="test">
        메뉴
      </div>
      <div class="title flex flex-col content-center">
        <!-- <img class="title_image" src="../assets/Header.jpg"/> -->
        TODOY
      </div>
      <div class="menu flex flex-col content-center">
        <div class="flex flex-row content-end">
          <div class="mr-2">회원가입</div>
          <div >로그인</div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { computed, reactive } from '@vue/reactivity'
import { useStore } from 'vuex'

export default {
  setup() {
    const store = useStore()
    const state = reactive({
      isLogin: computed(() => store.getters['root/getIsLogin']),
    })
    const test = () => {
      console.log('HI')
    }
    return {
      state,
      test,
    }
  },
  components: {},
}
</script>

<style scoped>
.container {
  height: 10vh;
  width: 100%;
  background-color: rgb(35, 40, 56);
}

.title {
  width: 40%;
  font-size: 3vw;
  text-align: center;
  color: white;
}

.menu {
  width: 30%;
  font-size: 2vw;
  color: white;
  cursor: pointer;
}

.t-left {
  text-align: left;
}

.t-right {
  text-align: right;
}
</style>
