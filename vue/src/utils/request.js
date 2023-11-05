
import axios from 'axios'
// 创建axios实例
const request = axios.create({
  baseURL: 'http://localhost:9090',
  timeout: 6000 // 请求超时日期
})

// 实例添加请求拦截器
request.interceptors.request.use(config => {
  config.headers['Content-Type'] = 'application/json;charset=utf-8'
  return config
}, (error) => {
  // 对请求错误做处理...
  return Promise.reject(error)
})

// 实例添加响应拦截器
request.interceptors.response.use(response => {
  let res = response.data
  if (typeof res === 'string') {
    res = res ? JSON.parse(res) : res
  }
  return res
}, (error) => {
  console.log('err' + error)
  return Promise.reject(error)
}
)

export default request
