<template>
  <q-drawer
    v-model="drawerState.isOpened"
    show-if-above
    bordered
    :width="300"
    side="right"
  >
    <DrawerHeader>
      <img src="../assets/drawer-banner.jpg" />
      <div class="drawer_cont"></div>
    </DrawerHeader>
    <q-list>
      <EssentialLink
        v-for="link in Links"
        :key="link.title"
        v-bind="link"
        :drawerOpen="drawerState.isOpened"
      />
    </q-list>
    <q-footer class="bg-white q-pa-md">
      <q-btn
        class="full-width text-caption"
        color="primary"
        label="고객센터 : 010-1234-5678"
        icon="support_agent"
        outline
        unelevated
      />
    </q-footer>
  </q-drawer>
</template>

<script setup lang="ts">
import EssentialLink from 'src/components/EssentialLink.vue';
import { Links } from '../router/links';
import { drawerOpenState } from 'src/stores/common';
import { styled } from 'emotion-vuejs';

const DrawerHeader = styled('div')({
  height: 120,
  backgroundColor: 'var(--q-primary)',
  color: '#fff',
  marginBottom: 8,
  position: 'relative',
  img: {
    position: 'absolute',
    left: 0,
    top: 0,
    width: '100%',
    height: '100%',
    objectFit: 'cover',
    objectPosition: 'center',
  },
  '.drawer_cont': {
    padding: 16,
    color: '#fff',
    position: 'absolute',
    top: '50%',
    transform: 'translate(0, -50%)',
    zIndex: 1,
    b: {
      fontWeight: 'bold',
      marginRight: 4,
    },
  },
});
const drawerState = drawerOpenState();
</script>
