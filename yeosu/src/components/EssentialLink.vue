<template>
  <q-item
    clickable
    tag="div"
    @click="
      () => {
        drawerState.close();
        $router.push(`${link}`);
      }
    "
    v-bind:class="{
      'text-primary text-bold': $route.path === link,
    }"
  >
    <q-item-section v-if="icon" avatar>
      <q-icon :name="icon" />
    </q-item-section>

    <q-item-section>
      <q-item-label>{{ title }}</q-item-label>
      <q-item-label caption>{{ caption }}</q-item-label>
    </q-item-section>
  </q-item>
</template>

<script setup lang="ts">
import { drawerOpenState } from 'src/stores/common';

const drawerState = drawerOpenState();

export interface EssentialLinkProps {
  title: string;
  caption?: string;
  link?: string;
  icon?: string;
}
withDefaults(defineProps<EssentialLinkProps>(), {
  caption: '',
  link: '#',
  icon: '',
});
</script>
