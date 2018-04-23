import React, { Component } from 'react';
import BasicDetail from "./BasicDetail";
import Aux from '../../hoc/AuxComponent';
import Business from './Business';
import classes from './Models.css';

const BusinessGroup =(props) => ( {
  render() {
    let businesses;
    if(props.businessGroup.businesses){
      businesses=props.businessGroup.businesses.map(business =>(
        <Business business={business}/>
      ));
    }
    return (
      <Aux className={classes.BusinessSection}>      
        <BasicDetail basicDetails={props.businessGroup.basicDetails}/>
        {businesses}
        <div className={classes.PlusSign} />
      </Aux>
    );
  }
});

export default BusinessGroup;
