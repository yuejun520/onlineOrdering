<template>
    <div id="app" class="">
        <router-view></router-view>
    </div>
</template>

<script>
export default {
    name: "app",
};
</script>

<style lang="scss">
* {
    padding: 0;
    margin: 0;
}
html,
body {
    width: 100%;
    height: 100%;
}
#app {
    height: 100%;
}
body {
    padding: 0;
    margin: 0;
}
.index-aside .menulist-item[data-v-0175fa3e] {
    padding: 0 !important;
}
.index-aside .index-aside-inner[data-v-0175fa3e] .el-menu {
    background-color: #535bba !important;
}
.loginIn .left {
    width: 400px !important;
    border-width: 0 !important;
    border-radius: 12px !important;
    margin: 0 auto !important;
    padding: 30px 40px 16px !important;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.15) !important;
    opacity: 0.95 !important;
}
.loginIn .left .title-container .title {
    width: 100% !important;
    margin: 0 auto 40px !important;
    font-size: 28px !important;
    background-color: unset !important;
    color: #333333 !important;
    padding: 0 !important;
    font-family: cursive !important;
}

.loginIn .loginInBt {
    background-color: #708eea !important;
    color: white !important;
    border-radius: 8px !important;
    width: 200px !important;
    height: 44px !important;
    font-size: 18px !important;
    letter-spacing: 5px !important;
    padding: 0 !important;
    margin: 0 67px !important;
}

.loginIn .left .el-form-item .el-radio.is-checked .el-radio__inner {
    background-color: #708eea !important;
    border-color: #708eea !important;
}
.loginIn .left .el-form-item .el-radio.is-checked .el-radio__label {
    color: #708eea !important;
}

.navbar {
    background-image: unset !important;
    background-color: #535bba !important;
}
.navbar .title-menu .title-name {
    color: white !important;
}
.navbar .right-menu div {
    color: white !important;
    background-color: #535bba !important;
}
.navbar .right-menu div.logout:hover {
    background-color: white !important;
    color: #708eea !important;
}
.app-breadcrumb {
    background-color: white !important;
    border-radius: 8px !important;
}
.index-aside .menulist-item {
    background-image: unset !important;
    background-color: #222d32 !important;
}

.index-aside .el-menu-demo .el-menu.el-menu--inline {
    width: 100% !important;
    margin: 0 !important;
    color: white !important;
    border-width: 0 !important;
    text-align: left !important;
    padding: 0 !important;
    text-indent: 35px !important;
}
.index-aside .el-menu-demo .el-menu.el-menu--inline .el-menu-item {
    text-align: left !important;
    padding: 0 !important;
    text-indent: 35px !important;
    color: white !important;
    height: 44px !important;
    line-height: 44px !important;
    border-radius: 0 !important;
    box-shadow: unset !important;
}
.index-aside .el-menu-demo .el-menu.el-menu--inline .el-menu-item:hover {
    height: 44px !important;
    border: 0 !important;
    border-radius: 0 !important;
    background-color: #708eea !important;
    line-height: 44px !important;
}
.index-aside .el-menu-demo .el-menu.el-menu--inline .el-menu-item.is-active {
    height: 44px !important;
    border: 0 !important;
    border-radius: 0 !important;
    background-color: #708eea !important;
    line-height: 44px !important;
}
.index-aside .el-menu-demo .el-submenu__title .el-submenu__icon-arrow {
    color: white !important;
}

.el-button {
    border-radius: 6px !important;
    border: 1px solid transparent !important;
    background-color: #6a82eb !important;
    color: white !important;
    margin-right: 5px !important;
}
.el-pagination.is-background .el-pager li:not(.disabled).active {
    background-color: #708eea !important;
}

.el-button.el-button--danger {
    background-color: #f52713 !important;
}
.el-checkbox__input.is-checked .el-checkbox__inner {
    background-color: #708eea !important;
    border-color: #708eea !important;
}
.el-checkbox__input.is-indeterminate .el-checkbox__inner {
    background-color: #708eea !important;
    border-color: #708eea !important;
}
.el-checkbox__inner:hover {
    border-color: #708eea !important;
}
.el-input__inner {
    border-color: #d9d9d9 !important;
    border-radius: 6px !important;
}
.el-input__inner:focus {
    border-color: #708eea !important;
}
.el-textarea__inner {
    border-color: #d9d9d9 !important;
    border-radius: 6px !important;
}
.el-textarea__inner:focus {
    border-color: #708eea !important;
}
.el-submenu__title:hover {
    background-color: #7a84e5 !important;
}

.form-content {
    width: 100% !important;
    height: 150px !important;
    margin-bottom: 30px !important;
    box-shadow: 0px 0px 12px 0px #d5d9e2 !important;
    border-radius: 10px !important;
    display: flex !important;
    justify-content: space-between;
    align-items: center;
}
.has-gutter tr th {
    background-color: #6a82eb !important;
    color: #fff;
}

.table-content {
    width: 100% !important;
    height: 100% !important;
    border-radius: 10px !important;
    box-shadow: 0px 0px 12px 0px #d5d9e2 !important;
}
.el-table--group,
.el-table--border {
    border: 0px !important;
}
.el-table {
    // padding:20px !important;
    padding-top: 30px;
    position: inherit !important;
}
.app-breadcrumb[data-v-b290fa88] {
    width: 100% !important;
    height: 50px !important;
    border-radius: 10px !important;
    box-shadow: 0px 0px 12px 0px #d5d9e2 !important;
    margin-right: 10px !important;
}
</style>
