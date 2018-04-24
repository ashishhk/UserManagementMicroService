import React from 'react';
import BusinessGroup from "../../components/models/BusinessGroup";
import Aux from '../../hoc/AuxComponent';
import classes from './Business.css';


const showBusinesses = (props) => ({

  render() {
    return (
      <Aux className={classes.BusinessCards}>
      <BusinessGroup businessGroup={props.businessGroup} />;
      </Aux>
    );
  }
});

export default showBusinesses;