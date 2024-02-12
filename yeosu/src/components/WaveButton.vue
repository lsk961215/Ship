<template>
  <WaveButton>
    <div class="wave-1"></div>
    <div class="wave-2"></div>
    <span>{{ title }}</span>
  </WaveButton>
</template>
<script setup lang="ts">
import { styled } from 'emotion-vuejs';
import { PropType } from 'vue';
defineProps({
  title: {
    type: String as PropType<string>,
    required: true,
  },
});

const WaveButton = styled('button')({
  appearance: 'none',
  border: '0',
  position: 'relative',
  width: '100%',
  height: 40,
  textDecoration: 'none',
  fontSize: 14,
  display: 'inline-block',
  textAlign: 'center',
  color: '#ffffff',
  letterSpacing: 1,
  overflow: 'hidden',
  borderRadius: 4,
  backgroundColor: 'var(--q-primary)',
  cursor: 'pointer',
  transitionDuration: '.3s',
  '&::before': {
    content: '""',
    width: '100%',
    height: '100%',
    backgroundColor: '#fff',
    position: 'absolute',
    left: 0,
    top: 0,
    transitionDuration: '.3s',
    opacity: 0,
    pointerEvents: 'none',
  },
  '&:hover': {
    '&::before': {
      opacity: 0.2,
    },
  },
  span: {
    position: 'absolute',
    left: '50%',
    top: '50%',
    transform: 'translate(-50%, -50%)',
  },
  'div[class^="wave-"]': {
    position: 'absolute',
    zIndex: 0,
    width: '100%',
    paddingBottom: '100%',
    borderRadius: '47%',
    opacity: 0.5,
  },
  '.wave-1': {
    backgroundColor: 'rgba(0,0,0,.25)',
    left: '80%',
    bottom: '-100%',
    transform: 'rotate(20deg)',
    animation: 'wave-1 6s infinite linear',
  },
  '.wave-2': {
    backgroundColor: 'rgba(0,0,0,.25)',
    right: '80%',
    top: '-100%',
    transform: 'rotate(180deg)',
    animation: 'wave-2 6s infinite linear',
  },
  '&:disabled': {
    backgroundColor: '#888',
  },
});
</script>
