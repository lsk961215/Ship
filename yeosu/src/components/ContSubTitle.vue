<template>
  <div class="text-subtitle1 flex no-wrap q-mt-xl q-mb-md">
    <div class="flex items-center full-width text-bold">
      <q-icon
        :name="icon || 'push_pin'"
        class="q-mr-sm"
        style="color: #e60048"
      />
      <span>{{ title }}</span>
    </div>
    <div v-if="showMore" class="full-width">
      <div
        class="flex items-center justify-end text-grey-6 text-caption"
        @click="
          () => {
            if (showMore) {
              showMore();
            }
          }
        "
      >
        더 보기
        <q-icon name="arrow_forward_ios" />
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
import { PropType } from 'vue';

export interface SubTitleProps {
  title: string;
  showMore?: () => void;
}
defineProps({
  title: {
    type: String as PropType<string>,
    required: true,
  },
  icon: {
    type: String as PropType<string>,
    required: false,
  },
  showMore: {
    type: Function,
    required: false,
  },
});
</script>
