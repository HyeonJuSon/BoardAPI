<template>
 <div class="test">
   HIHI
 </div>
</template>

<script>
import {useStore} from 'vuex';
export default{
  name:"Home",
  setup(){
    const store= useStore();
    let id = 'test';
  store.dispatch('root/getUser',id)
  .then((response)=>{
    console.log(response.data);
  });
  }
}


</script>

<style scoped>
.test{
  background-color: black;
  height: 100vh;
}

</style>