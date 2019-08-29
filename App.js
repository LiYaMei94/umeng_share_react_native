
import React, {Component} from 'react';
import {TouchableHighlight, Text,StyleSheet, Button, View} from 'react-native';
import ShareUtil from './libs/ShareUtil';
export default class App extends Component{
  boardShare(){
    var list = [0,1,2,3,4,7];//0:qq,1:新浪, 2:微信, 3:微信朋友圈,4:qq空间, 7:Facebook
    ShareUtil.shareboard('sssss','http://dev.umeng.com/images/tab2_1.png','http://www.umeng.com/','title',list,(code,message) =>{
        console.warn(message)
    });
  }
  sinaweiboShare(){
    ShareUtil.share('sssss','http://dev.umeng.com/images/tab2_1.png','http://www.umeng.com/','title',1,(code,message) =>{
      console.warn(message)
    });
  }
  qqShare(){
    ShareUtil.share('sssss','http://dev.umeng.com/images/tab2_1.png','http://www.umeng.com/','title',0,(code,message) =>{
      console.warn(message)
    });
  }
  wxShare(){
    ShareUtil.share('sssss','http://dev.umeng.com/images/tab2_1.png','http://www.umeng.com/','title',2,(code,message) =>{
      console.warn(message)
    });
  }
  qqAuth(){
    ShareUtil.auth(0,(code,result,message) =>{
      if (code == 200){
        console.warn(result)
      }
  });
  }
  render() {
    return (
      <View style={styles.container}>
        <TouchableHighlight
          underlayColor='transparent' 
          onPress={this.boardShare.bind(this)}
          style={styles.button_item}>
          <Text>友盟面板分享</Text>
        </TouchableHighlight>
        <TouchableHighlight 
          underlayColor='transparent' 
          onPress={this.sinaweiboShare.bind(this)}
          style={styles.button_item}>
          <Text>新浪微博分享</Text>
        </TouchableHighlight>
        <TouchableHighlight 
          underlayColor='transparent' 
          onPress={this.qqShare.bind(this)}
          style={styles.button_item}>
          <Text>qq分享</Text>
        </TouchableHighlight>
        <TouchableHighlight 
          underlayColor='transparent' 
          onPress={this.wxShare.bind(this)}
          style={styles.button_item}>
          <Text>微信分享</Text>
        </TouchableHighlight>
        <TouchableHighlight 
          underlayColor='transparent' 
          onPress={this.qqAuth.bind(this)}
          style={styles.button_item}>
          <Text>qq授权登录</Text>
        </TouchableHighlight>
      </View>
    );
  }
}
const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  button_item:{
    marginBottom:15,
    justifyContent: 'center',
    alignItems: 'center',
    width:150,
    height:50,
    backgroundColor:'skyblue'
  }
});
