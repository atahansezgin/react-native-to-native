import React from 'react';
import {AppRegistry, StyleSheet, Text, View} from 'react-native';

const HelloMessage = ({ name }) => {
  return (
    <View style={styles.container}>
      <Text style={styles.hello}>Hello, {name}</Text>
    </View>
  );
};
const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
  },
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
    color:"#000"
  },
});

AppRegistry.registerComponent('HelloMessage',() => HelloMessage);