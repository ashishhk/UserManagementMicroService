import React, { Component } from 'react';
import BasicDetail from "./BasicDetail";

const Business =(props) =>({
  render() {
    return (
        <BasicDetail basicDetails={props.business.basicDetails}/>
    );
  }
});

export default Business;
