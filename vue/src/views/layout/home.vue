<template>
  <div class="home">
    <!-- 导航条 -->
    <van-nav-bar title="闲鱼" fixed />

    <!-- 搜索框 -->
    <van-search
      readonly
      shape="round"
      background="#f1f1f2"
      placeholder="请在此输入搜索关键词"
      @click="$router.push('/search')"
    />
    <van-grid column-num="5" icon-size="40">
    <van-grid-item
      v-for="item in navList" :key="item.categoryID"
      :icon=setIcon(item.categoryID)
      :text=item.categoryName
      @click="$router.push('/category')"
    />
    </van-grid>
    <div class="main">
      <img src="@/assets/main.png" alt="">
    </div>
    <!-- 猜你喜欢 -->
    <div class="guess">
      <p class="guess-title">—— 猜你喜欢 ——</p>
      <div class="goods-list" v-for="item in proList" :key="item.productID" :item="item" >
        <div v-if="item.productID!=0" class="goods-item" @click="$router.push(`/prodetail/${item.productID}`)">
          <div class="left">
            <el-image :src="imgPathConvert(item.imageURL)" lazy>
            </el-image>
          </div>
          <div class="right">
            <p class="tit text-ellipsis-2">
              {{ item.title}}
            </p>
            <p class="count"> {{ item.intentnum }} 人想要</p>
            <p class="price">
              <span class="new">¥{{ item.price }}</span>
            </p>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import request from '@/utils/request'
const imgPath = path => 'http://localhost:9090/common/download?name=' + path
export default {
  name: 'HomePage',

  data () {
    return {
      bannerList: [], // 轮播
      navList: [],
      proList: [],
      img: ' '
    }
  },
  created () {
    request.get('/category/list').then(res => {
      this.navList = res.data
    })
    request.get('/product/guess').then(res => {
      this.proList = res.data
    })
  },
  methods: {
    setIcon (ID) {
      // eslint-disable-next-line eqeqeq
      if (ID % 3 == 0) {
        return 'bag-o'
        // eslint-disable-next-line eqeqeq
      } else if (ID % 3 == 1) { return 'gem-o' } else if (ID % 3 == 2) { return 'gift-o' }
      return 'new-arrival-o'
    },
    imgPathConvert (path) {
      return imgPath(path)
    }
  }
}

</script>

<style lang="less" scoped>
// 主题 padding
.home {
  padding-top: 100px;
  padding-bottom: 50px;
}

// 导航条样式定制
.van-nav-bar {
  z-index: 999;
  background-color: rgba(208, 176, 13, 0.92);
  ::v-deep .van-nav-bar__title {
    color: #fff;
  }
}

// 搜索框样式定制
.van-search {
  position: fixed;
  width: 100%;
  top: 46px;
  z-index: 999;
}

// 分类导航部分
.my-swipe .van-swipe-item {
  height: 185px;
  color: #fff;
  font-size: 20px;
  text-align: center;
  background-color: #39a9ed;
}
.my-swipe .van-swipe-item img {
  width: 100%;
  height: 185px;
}

// 主会场
.main img {
  display: block;
  width: 100%;
}

// 猜你喜欢
.guess .guess-title {
  height: 40px;
  line-height: 40px;
  text-align: center;
}

// 商品样式
.goods-list {
  background-color: #f6f6f6;
}
.goods-item {
  height: 148px;
  margin-bottom: 6px;
  padding: 10px;
  background-color: #fff;
  display: flex;
  .left {
    width: 127px;
    img {
      display: block;
      width: 100%;
    }
  }
  .right {
    flex: 1;
    font-size: 14px;
    line-height: 1.3;
    padding: 10px;
    display: flex;
    flex-direction: column;
    justify-content: space-evenly;

    .count {
      color: #999;
      font-size: 12px;
    }
    .price {
      color: #999;
      font-size: 16px;
      .new {
        color: #f03c3c;
        margin-right: 10px;
      }
      .old {
        text-decoration: line-through;
        font-size: 12px;
      }
    }
  }
}
#divType ul {
  margin-top: 61rem;
  overflow-y: auto;
  height: calc(100% - 61rem);
  padding-bottom: 200rem;
  box-sizing: border-box;
  width: 84rem;
  opacity: 1;
  background: #f6f6f6;
  padding: 16rem;
  opacity: 1;
  font-size: 13rem;
  font-family: PingFangSC, PingFangSC-Regular;
  font-weight: 400;
  text-align: left;
  color: #666666;
  line-height: 18rem;
  letter-spacing: 0rem;
  word-wrap: break-word;
  word-break: normal;
}
</style>
