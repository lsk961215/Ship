<template>
  <StyledMainBanner>
    <!-- <img src="../../assets/banner.jpeg" /> -->
    <img src="../../assets/banner.jpeg" />
    <div class="banner_txt">
      <div class="banner_tit">Yeosu</div>
      <div class="banner_desc">아름다운 여수바다 크루즈 투어</div>
      <div class="banner_deco"></div>
    </div>
  </StyledMainBanner>
</template>
<script setup lang="ts">
import { styled } from 'emotion-vuejs';

const StyledMainBanner = styled('div')({
  position: 'relative',
  height: 320,
  overflow: 'hidden',
  img: {
    width: '100%',
    height: '100%',
    objectFit: 'cover',
    objectPosition: 'center',
  },
  '.banner_txt': {
    position: 'absolute',
    left: 0,
    top: '50%',
    transform: 'translate(0, -50%)',
    padding: '20px 48px 20px 20px',
    backdropFilter: 'blur(2px)',
    borderRadius: '0 8px 8px 0',
    overflow: 'hidden',
    color: '#001837',
    '&::after': {
      content: '""',
      position: 'absolute',
      left: 0,
      top: 0,
      backgroundColor: '#ffffff',
      opacity: '0.5',
      width: '100%',
      height: '100%',
      zIndex: '-1',
    },
    '.banner_tit': {
      fontSize: 24,
      fontWeight: '700',
      fontFamily: 'Times New Roman',
      letterSpacing: 10,
      opacity: 0.8,
    },
    '.banner_desc': {
      fontSize: 10,
      marginTop: 4,
      fontWeight: 500,
      opacity: 0.6,
    },
    '.banner_deco': {},
  },
});
</script>
