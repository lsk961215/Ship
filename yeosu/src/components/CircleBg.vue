<template>
  <StyledOverlapCont>
    <StyledCircle class="left" />
    <StyledCircle class="right" />
  </StyledOverlapCont>
  <div class="relative-position">
    <slot></slot>
  </div>
</template>
<script setup lang="ts">
import { styled } from 'emotion-vuejs';

const StyledOverlapCont = styled('div')({
  // position: 'absolute',
  // width: '100%',
  // height: '100%',
  // left: 0,
  // top: 0,
});
const StyledCircle = styled('div')({
  border: '3em solid var(--q-primary)',
  position: 'absolute',
  borderRadius: '100%',
  zIndex: 0,
  opacity: 0.07,
  pointerEvents: 'none',
  '&.left': {
    right: '80%',
    bottom: 0,
    width: 400,
    height: 400,
  },
  '&.right': {
    left: '80%',
    top: 0,
    width: 300,
    height: 300,
  },
});
</script>
