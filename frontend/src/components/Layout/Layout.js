import React from 'react';
import Aux from '../../hoc/AuxComponent';
import classes from './Layout.css';
import Header from "../../containers/HeaderFooter/Header";
import Footer from "../../containers/HeaderFooter/Footer";
import BusinessUserPanel from "../../containers/Business/BusinessUserPanel";

const Layout = (props) => (
    <Aux>
        <Header />
        <BusinessUserPanel/>
        <main className={classes.content}> {props.children} </main>
        <Footer/>
    </Aux>
);

export default Layout;