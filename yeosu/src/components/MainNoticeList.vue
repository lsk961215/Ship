<template>
  <div>
    <q-list>
      <q-item>
        <q-item-section>
          <q-item-label>{{ title }}</q-item-label>
          <q-item-label v-if="desc" caption>{{ desc }}</q-item-label>
        </q-item-section>

        <q-item-section side top v-if="meta">
          <q-item-label caption>{{ meta }}</q-item-label>
        </q-item-section>
      </q-item>
    </q-list>
    <q-separator spaced inset />
  </div>
</template>

<script setup lang="ts">
import { PropType } from 'vue';

export interface SubTitleProps {
  title: string;
  desc?: string;
  meta?: string;
}
defineProps({
  title: {
    type: String as PropType<string>,
    required: true,
  },
  desc: {
    type: String as PropType<string>,
    required: false,
  },
  meta: {
    type: String as PropType<string>,
    required: false,
  },
});
</script>
