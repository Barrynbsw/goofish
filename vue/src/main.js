import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import Vant from 'vant'
import 'vant/lib/index.css'
import '@/styles/common.less'
Vue.use(Vant)
new Vue({
  render: h => h(App),
  router: router,
  store
}).$mount('#app')
