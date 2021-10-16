import { createApp, h } from 'vue'
import App from './App.vue'
// store
import store from './common/store'
// router
import router from './router'
// axios
import VueAxios from './common/axios'
import axios from './common/axios'

const app = createApp({
    render: () => h(App)
})
app.use(VueAxios, axios)
app.use(store)
app.use(router)
app.mount('#app')