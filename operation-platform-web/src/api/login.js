import { postAxios, getAxios } from '@/lib/http'
export const loginApi = {
  // 登录
  login: data => {
    return postAxios('/session/login', data, true)
  },
  // 根据token获取session
  getSession: () => {
    return getAxios('/session/get')
  },
  // 登出
  logout: (token) => {
    return getAxios(`/session/logOut?x-access-token=${token}`)
  }
}
