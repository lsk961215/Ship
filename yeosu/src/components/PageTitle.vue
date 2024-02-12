<template>
  <q-page-sticky expand position="top" style="z-index: 3">
    <MaxWidthCont>
      <q-toolbar class="text-white" style="background-color: #818b96">
        <q-icon name="location_on" />
        <q-toolbar-title class="text-subtitle2"> {{ title }} </q-toolbar-title>
      </q-toolbar>
    </MaxWidthCont>
  </q-page-sticky>
</template>
<script setup lang="ts">
import { MaxWidthCont } from 'src/styled/common';
import { PropType } from 'vue';
defineProps({
  title: {
    type: String as PropType<string>,
    required: true,
  },
});
</script>
