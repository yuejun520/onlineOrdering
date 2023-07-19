const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootz5055/",
            name: "springbootz5055",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootz5055/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "线上点餐系统"
        } 
    }
}
export default base
