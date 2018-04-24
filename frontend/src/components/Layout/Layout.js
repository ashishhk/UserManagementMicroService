import React from 'react';
import classes from './Layout.css';
import Header from "../HeaderFooter/Header";
import Footer from "../HeaderFooter/Footer";
import LoginHome from '../Login/LoginHome';
import { Panel } from 'react-bootstrap';

const Layout = (props) => ({
    render() {
        console.log(props.loginHomeVisible);
        return (
            <Panel>
                <Panel.Heading><Header /></Panel.Heading>
                <Panel.Body>
                <LoginHome/>
                    <main className={classes.content}> {props.children} </main>
                </Panel.Body>
                <Panel.Footer><Footer /></Panel.Footer>
            </Panel>
        );
    }
}
);

export default Layout;