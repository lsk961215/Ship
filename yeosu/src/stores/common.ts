import { defineStore } from 'pinia';

//Drawer Open State Store
export const drawerOpenState = defineStore('drawerOpen', {
  state: () => ({
    isOpened: false,
  }),
  getters: {},
  actions: {
    open() {
      this.isOpened = true;
    },
    close() {
      this.isOpened = false;
    },
  },
});

//Booked Schedule Info Store
export const bkdSchdInfoStore = defineStore('bkdSchdInfoStore', {
  state: () => ({
    tmNo: null,
    operDate: '',
    operTime: '',
    custCnt: 0,
    ticketPrice: 0,
  }),
  getters: {},
  actions: {},
  persist: true,
});
