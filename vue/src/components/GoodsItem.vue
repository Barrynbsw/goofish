<template>
  <div v-if="item.productID" class="goods-item" @click="$router.push(`/prodetail/${item.productID}`)">
    <div class="left">
      <img :src="item.imageURL" alt="" />
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
</template>

<script>
export default {
  name: 'GoodsItem'
}
</script>

<style lang="less" scoped>
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
</style>
