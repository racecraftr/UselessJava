import './style.css'

import * as THREE from 'three';

import { OrbitControls } from 'three/examples/jsm/controls/OrbitControls';

const scene = new THREE.Scene();

const camera = new THREE.PerspectiveCamera(75, window.innerWidth/window.innerHeight, 0.1, 1000);

const renderer = new THREE.WebGLRenderer({
  canvas: document.querySelector('#bg')
})

renderer.setPixelRatio(window.devicePixelRatio);
renderer.setSize(window.innerWidth, window.innerHeight);
camera.position.setZ(30);

// renderer.render(scene, camera);

const geometry = new THREE.TorusKnotGeometry(10, 3, 100, 16)
const material = new THREE.MeshStandardMaterial({
  color: 0x7742d4,
})

const depthMaterial = new THREE.MeshDepthMaterial();

const torus = new THREE.Mesh(geometry, material)

scene.add(torus)

const pointLight = new THREE.PointLight(0xffffff);
pointLight.position.set(20, 20, 20)

scene.add(pointLight)

const ambiance = new THREE.AmbientLight(0xa0a0a0);
scene.add(ambiance)

const controls = new OrbitControls(camera, renderer.domElement);

function animate() {
  requestAnimationFrame(animate);
  torus.rotation.x += 0.01;
  torus.rotation.y += 0.005;
  torus.rotation.z += 0.01;
  renderer.render(scene, camera);
}

animate()