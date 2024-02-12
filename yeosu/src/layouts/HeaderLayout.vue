<template>
  <q-header
    reveal
    class="text-dark bg-transparent"
    v-bind:class="{
      'main-header': $route.path === '/',
    }"
  >
    <MaxWidthCont>
      <HeaderColorWrap
        v-bind:class="{
          'bg-white': isScrolled || $route.path != '/',
        }"
      >
        <q-toolbar>
          <q-toolbar-title>
            <StyledLogo
              title="여수해양관광 로고"
              @click="
                () => {
                  $router.push('/');
                }
              "
            >
              <i
                class="logo"
                v-bind:class="{
                  white: !isScrolled && $route.path === '/',
                }"
              ></i>
              <LogoText
                v-bind:class="{
                  white: !isScrolled && $route.path === '/',
                }"
              >
                <h1>여수해양관광</h1>
                <span class="comp_slogan">YEOSU MARINE TOURISM</span>
              </LogoText>
            </StyledLogo>
          </q-toolbar-title>
          <div>
            <q-btn
              flat
              dense
              round
              icon="menu"
              aria-label="Menu"
              @click="drawerState.open"
              v-bind:class="{
                'text-white': !isScrolled && $route.path === '/',
              }"
            />
          </div>
        </q-toolbar>
      </HeaderColorWrap>
    </MaxWidthCont>
  </q-header>
</template>
<script setup lang="ts">
import { drawerOpenState } from 'src/stores/common';
import { styled } from 'emotion-vuejs';
import { MaxWidthCont } from '../styled/common';
import { ref } from 'vue';
import { useRoute } from 'vue-router';

const isScrolled = ref(false);
const drawerState = drawerOpenState();
const route = useRoute();

window.addEventListener('scroll', () => {
  isScrolled.value = route.path === '/' && window.scrollY > 50 ? true : false;
});

const StyledLogo = styled('div')({
  display: 'inline-flex',
  width: 'auto',
  cursor: 'pointer',
  alignItems: 'center',
  '.logo': {
    display: 'inline-block',
    width: 32,
    height: 32,
    marginRight: 6,
  },
  h1: { fontWeight: 900 },
  '.comp_slogan': {
    fontSize: 10,
    opacity: 0.75,
  },
});

const LogoText = styled('div')({
  display: 'flex',
  flexFlow: 'column',
  height: 32,
  justifyContent: 'end',
  gap: 2,
  color: '#00458a',
  fontSize: 16,
  '&.white': {
    color: '#fff',
  },
});

const HeaderColorWrap = styled('div')({
  transitionDuration: '0.3s',
});
</script>
