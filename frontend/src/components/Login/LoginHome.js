import React from 'react';
import Aux from '../../hoc/AuxComponent';
import classes from './Login.css';
import { Grid, Row, Col, ButtonToolbar, ButtonGroup, Button } from 'react-bootstrap';

const loginHome = (props) => ({
    handleCreateClick() {

    },
    handleSearchHomeRedirection() {

    },
    render() {
        return (
            <Aux>
                <p>Hello {props.firstName}</p>
                <ButtonToolbar>
                    <ButtonGroup>
                        <Button bsStyle='primary' onClick={this.handleCreateClick}>Create(List) your business hear.</Button>
                    </ButtonGroup>
                    <ButtonGroup>
                        <Button bsStyle='warning' onClick={this.handleSearchHomeRedirection}>No Thanks!!</Button>
                    </ButtonGroup>
                </ButtonToolbar>
            </Aux> 
        )
    }
});

export default loginHome;