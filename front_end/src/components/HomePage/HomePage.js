import React, { useState } from 'react';

import NavBar from '../NavBar/NavBar';
import Hero from '../Hero/Hero';
import Presentat from '../Presentat/Presentat';
import Footer from '../Footer/Footer';

import InscriptionModal from '../InscriptionModal/InscriptionModal';
import Connection from '../connection/Connection';

const HomePage = () => {
  const [hideInscriptionModal, setHideInscriptionModal] = useState(true);
  const [hideConnectionModal, setHideConnectionModal] = useState(true);

  const hideInscriptionModalHandler = (val) => {
    setHideInscriptionModal(val);
  };

  const hideConnectionModalHandler = (val) => {
    setHideConnectionModal(val);
  };

  return (
    <div className="homePage">
      <Connection
        hideConnectionModalValue={hideConnectionModal}
        onHideConnectionModal={hideConnectionModalHandler}
      ></Connection>
      <InscriptionModal
        hideInscriptionModalValue={hideInscriptionModal}
        onHideInscriptionModal={hideInscriptionModalHandler}
      ></InscriptionModal>
      <NavBar
        onHideInscriptionModal={hideInscriptionModalHandler}
        onHideConnectionModal={hideConnectionModalHandler}
      ></NavBar>
      <Hero></Hero>
      <Presentat></Presentat>
      <Footer></Footer>
    </div>
  );
};

export default HomePage;
