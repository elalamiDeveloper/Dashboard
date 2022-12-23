import React from 'react';

import styles from './InscriptionModal.module.css';
import PrimaryButton from '../UI/PrimaryButton/PrimaryButton';

const InscriptionModal = (props) => {
  const {
    'inscription-modal': inscriptionModal,
    'modal-form': modalForm,
    'form-title': formTitle,
    'form-item': formItem,
    'form-label': formLabel,
    'form-input': formInput,
    'submit-btn': submitBtn,
    hidden,
  } = styles;

  const closeInscriptionModal = (e) => {
    if (!(e.target.className.split(' ')[0] === inscriptionModal)) return;
    props.onHideInscriptionModal(true);
  };

  return (
    <div
      className={`${inscriptionModal} ${
        props.hideInscriptionModalValue ? hidden : ''
      }`}
      onClick={closeInscriptionModal}
    >
      <form className={modalForm}>
        <h2 className={formTitle}>Inscription</h2>
        <div className={formItem}>
          <label className={formLabel}>Nom</label>
          <input className={formInput} type="text" />
        </div>
        <div className={formItem}>
          <label className={formLabel}>Prenom</label>
          <input className={formInput} type="text" />
        </div>
        <div className={formItem}>
          <label className={formLabel}>email</label>
          <input className={formInput} type="email" />
        </div>
        <div className={formItem}>
          <label className={formLabel}>re-enter email</label>
          <input className={formInput} type="email" />
        </div>
        <div className={formItem}>
          <label className={formLabel}>password</label>
          <input className={formInput} type="password" />
        </div>
        <div className={formItem}>
          <label className={formLabel}>re-enter password</label>
          <input className={formInput} type="password" />
        </div>
        <PrimaryButton type="submit" className={submitBtn}>
          Valider
        </PrimaryButton>
      </form>
    </div>
  );
};

export default InscriptionModal;
