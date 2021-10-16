import { createApp, h } from 'vue'
import App from './App.vue'
// router
import router from './router'
// axios
import VueAxios from './common/axios'
import axios from './common/axios'

const app = createApp({
    render: () => h(App)
});
app.use(VueAxios, axios)
app.use(store)
app.use(router)
createApp(App).mount('#app')