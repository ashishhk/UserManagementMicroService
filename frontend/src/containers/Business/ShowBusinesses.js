import React from 'react';
import BusinessGroup from "../../components/models/BusinessGroup";
import CreateBusinessGroup from "./CreateBusinessGroup";
import Aux from '../../hoc/AuxComponent';
import classes from './Business.css';


const showBusinesses = (props) => ({

  render() {
    let businessGroupDiv = <CreateBusinessGroup />;
    if (props.businessGroup.basicDetails) {
      businessGroupDiv = <BusinessGroup businessGroup={props.businessGroup} />;
      console.log(props.businessGroup);

    }
    return (
      <Aux className={classes.BusinessCards}>
        {businessGroupDiv}
      </Aux>
    );
  }
});

export default showBusinesses;