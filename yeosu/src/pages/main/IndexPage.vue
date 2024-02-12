<template>
  <q-page>
    <MainBanner />
    <div class="q-pa-md q-mb-lg">
      <WaveButton
        title="예약하기"
        @click="
          () => {
            $router.push('/book');
          }
        "
      />
      <div class="flex q-mt-sm" style="gap: 8px">
        <div class="col text-center">
          <q-btn
            color="primary"
            class="full-width"
            label="나의 예약확인"
            unelevated
            @click="
              () => {
                $router.push('/inquireReserve');
              }
            "
          />
        </div>
        <div class="col text-center">
          <q-btn
            color="primary"
            class="full-width"
            label="1:1 문의"
            unelevated
            @click="
              () => {
                $router.push('/qna');
              }
            "
          />
        </div>
      </div>
      <div class="relative-position">
        <CircleBg>
          <div class="">
            <ContSubTitle
              title="공지사항"
              :show-more="
                () => {
                  $router.push('/notice');
                }
              "
            />
            <MainNoticeList
              v-for="(notice, index) in mainNoticeData"
              :key="index"
              :title="notice.title"
              :desc="notice.desc"
              :meta="notice.meta"
            />
            <ContSubTitle title="오시는 길" />
            <MapArea></MapArea>
          </div>
        </CircleBg>
      </div>
    </div>
  </q-page>
</template>

<script setup lang="ts">
import MainNoticeList from '../../components/MainNoticeList.vue';
import ContSubTitle from '../../components/ContSubTitle.vue';
import MainBanner from './MainBanner.vue';
import WaveButton from 'src/components/WaveButton.vue';
import CircleBg from 'src/components/CircleBg.vue';
import { styled } from 'emotion-vuejs';

const MapArea = styled('div')({
  width: '100%',
  height: '320px',
  backgroundColor: '#999',
});

const mainNoticeData = [
  {
    title: '공지사항1 제목',
    desc: '공지사항1 내용',
    meta: '2024-01-01',
  },
  {
    title: '공지사항2 제목',
    desc: '공지사항2 내용',
    meta: '2024-01-01',
  },
  {
    title: '공지사항3 제목',
    desc: '공지사항3 내용',
    meta: '2024-01-01',
  },
];
</script>
