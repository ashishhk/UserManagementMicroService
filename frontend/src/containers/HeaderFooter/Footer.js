import React from 'react';
import Aux from '../../hoc/AuxComponent';
import classes from './HeaderFooter.css';

const footer = (props) => (
    <Aux>
        <div className={classes.Footer}>
            <p>This Text means nothing and is only written to have something to write, please ignore and if you have already read it, please excuse.</p>
            <p>some more text</p>
        </div>
    </Aux>
);

export default footer;
