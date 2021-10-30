<template>
  <div class="container">
    <div class="title">
      <!-- <img class="title_image" src="../assets/Header.jpg"/> -->
      ZOOTOPIA
    </div>
  </div>
</template>

<script>

export default {
  setup() {
  

    return{
    }
  },
}
</script>


<style scoped>
.container{
  height: 15vh;
  width: 100%;
  background-color: white;
  display: flex;
  flex-direction: column;
  justify-content: center;
}

.title{
  font-size: 5vw;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-content: center;
  text-align: center;
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;

}

.title_image{
  height:30vh;
}
</style>